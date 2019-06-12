# 问题汇总
## 集成mybatis：
1. [IDEA编译后没有找到mapper.xml文件](https://blog.csdn.net/baidu_28149499/article/details/88650309)

---
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found)

idea编译mapper之后总是报说没有找到该方法。检查了好多变接口名字或者函数名就是没发觉有错误，后来才查到原来Idea默认不编译 src\main\java下的xml文件的，所以如果是使用mybatis，有两个方案：

* 把mapper.xml放到src\main\resource文件夹下即可
* 在pom.xml下加个配置：也就是说保证 编译的时候会找到src/main/java文件夹下的xml文件

```xml
    <build>
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>
        </resources>
    </build>
```  
---
2. mybatis update并非所有字段需要更新的解决办法(需求：更新字段作为参数，未更新字段不传入)

```xml
<update id="updateUser" parameterType="com.test.entity.User">
        update BS_USER
            <trim prefix="set" suffixOverrides=",">
                <if test="ACCOUNT != null">ACCOUNT=#{ACCOUNT},</if>
                <if test="NAME != null">NAME=#{NAME},</if>
                <if test="PROV != null">PROV=#{PROV},</if>
                <if test="FAILURE_TIME != null">FAILURE_TIME=#{FAILURE_TIME},</if>
            </trim>
        where USERID=#{USERID}
    </update>
```

* 将set标签换成<trim prefix="set"></tirm>
* 标签中suffixOverrides=","的意思是最后一个去掉逗号
