package com.ucmed.library.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "book")
public class Book {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 图书编号
     */
    private String no;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 类型编号
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 作者
     */
    private String author;

    /**
     * 书架位置
     */
    private Double position;

    /**
     * 图书总数量
     */
    private Integer total;

    /**
     * 在馆数量
     */
    private Integer remain;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 删除标记
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    /**
     * 简介
     */
    private String description;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取图书编号
     *
     * @return no - 图书编号
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置图书编号
     *
     * @param no 图书编号
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * 获取图书名称
     *
     * @return name - 图书名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置图书名称
     *
     * @param name 图书名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类型编号
     *
     * @return category_id - 类型编号
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置类型编号
     *
     * @param categoryId 类型编号
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取书架位置
     *
     * @return position - 书架位置
     */
    public Double getPosition() {
        return position;
    }

    /**
     * 设置书架位置
     *
     * @param position 书架位置
     */
    public void setPosition(Double position) {
        this.position = position;
    }

    /**
     * 获取图书总数量
     *
     * @return total - 图书总数量
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 设置图书总数量
     *
     * @param total 图书总数量
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 获取在馆数量
     *
     * @return remain - 在馆数量
     */
    public Integer getRemain() {
        return remain;
    }

    /**
     * 设置在馆数量
     *
     * @param remain 在馆数量
     */
    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取删除标记
     *
     * @return is_delete - 删除标记
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置删除标记
     *
     * @param isDelete 删除标记
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取简介
     *
     * @return description - 简介
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置简介
     *
     * @param description 简介
     */
    public void setDescription(String description) {
        this.description = description;
    }
}