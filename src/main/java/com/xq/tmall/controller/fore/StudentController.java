package com.xq.tmall.controller.fore;
import com.xq.tmall.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController    //代表是Controller类,还要用RequestMapping映射请求
public class StudentController {
    @Autowired
    private  RedisTemplate redisTemplate;
    @PostMapping("/set")
    public void set(@RequestBody Student student){
        redisTemplate.opsForValue().set("student",student);
    }
    @GetMapping("/string")
    public String test(){
        redisTemplate.opsForValue().set("str","hello");
        String res=(String) redisTemplate.opsForValue().get("str");
        return res;
    }
}
