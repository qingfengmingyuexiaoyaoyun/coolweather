package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
//在第三阶段中，我们就要开始去查询天气，并且把天气信息显示出来了。由于和风天气返回的
//JSON数据结构非常复杂，如果还使用JSONObject来解析就会很麻烦，这里我们就准备借助
//GSON来对天气信息进行解析了。
//GSON的用法很简单，解析数据只需要一行代码就能完成了，但前提是要先将数据对应的实体类
//创建好。由于和风天气返回的数据内容非常多，这里我们不可能将所有的内容都利用起来，因
//此我筛选了一些比较重要的数据来进行解析。
//由于JSON中的一些字段可能不太适合直接作为Java字段来命名，因此这里使用了
//@SerializedName注解的方式来让JSON字段和Java字段之间建立映射关系。
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
