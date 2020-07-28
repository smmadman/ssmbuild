package com.junjie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data //除了有参构造都有了
@AllArgsConstructor //偷懒插件
@NoArgsConstructor
public class Books implements Serializable {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
