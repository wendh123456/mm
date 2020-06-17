package cn.itcast.service.impl;

import cn.itcast.dao.ProvinceDao;
import cn.itcast.dao.impl.ProvinceDaoImpl;
import cn.itcast.domain.Province;
import cn.itcast.service.ProvinceService;
import cn.itcast.util.JedisPoolUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceDao dao = new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {

        return dao.findAll();
    }

    /**
     * 使用redis缓存
     *
     * @return
     */
    @Override
    public String findAllJson() {
        //1.先从redis中查询数据
        //1.1获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
//        System.out.println(jedis);
        String province_json = jedis.get("province");
        System.out.println(province_json);

        //判断province_json的值是否为空
        if (province_json == null || province_json.length() == 0) {
            System.out.println("数据库中查");
            List<Province> ps = dao.findAll();
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            //2.3 将json数据存入redis
            jedis.set("province", province_json);
            //归还连接
            jedis.close();
        } else {
            System.out.println("redis中查询");
        }

        return province_json;
    }
}
