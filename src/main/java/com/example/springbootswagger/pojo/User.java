package com.example.springbootswagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体类")
public class User implements Serializable {
    //如果属性是private就不会暴露出来
    @ApiModelProperty("用户的id")
    private  Integer id;

    @ApiModelProperty("用户的姓名")
    private String name;

    @ApiModelProperty("用户的年纪")
    private Integer age;

}
