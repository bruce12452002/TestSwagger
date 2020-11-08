package idv.home.TestSwagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "動物", description = "動物類別")
public class Animal {
    @ApiModelProperty(name = "animalId", value = "編號") // @ApiModelProperty 還要 getter 才能顯示的出來
    private Integer id;

    @ApiModelProperty(value = "名", required = true, hidden = false) // hidden 預設就是 false
    private String name;

    // 圓括號排除；方括號包括，兩個可混用；還有 infinity 和 -infinity 可用，但用 swagger的畫面測試不太對
    @ApiModelProperty(allowableValues = "range(1,2,3,4]")
    private Integer age;

    @ApiModelProperty(allowableValues = "100,200, 300")
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
