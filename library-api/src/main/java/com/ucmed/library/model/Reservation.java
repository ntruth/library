package com.ucmed.library.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "reservation")
public class Reservation {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 图书id
     */
    @Column(name = "book_id")
    private Integer bookId;

    /**
     * 学生id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 借书日期
     */
    @Column(name = "borrow_time")
    private Date borrowTime;

    /**
     * 图书预约状态 1过期 2拒绝预约 3成功 4正在预约 5取消预约
     */
    private Byte status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 删除标记
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取图书id
     *
     * @return book_id - 图书id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 设置图书id
     *
     * @param bookId 图书id
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * 获取学生id
     *
     * @return user_id - 学生id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置学生id
     *
     * @param userId 学生id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取借书日期
     *
     * @return borrow_time - 借书日期
     */
    public Date getBorrowTime() {
        return borrowTime;
    }

    /**
     * 设置借书日期
     *
     * @param borrowTime 借书日期
     */
    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    /**
     * 获取图书预约状态 1过期 2拒绝预约 3成功 4正在预约 5取消预约
     *
     * @return status - 图书预约状态 1过期 2拒绝预约 3成功 4正在预约 5取消预约
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置图书预约状态 1过期 2拒绝预约 3成功 4正在预约 5取消预约
     *
     * @param status 图书预约状态 1过期 2拒绝预约 3成功 4正在预约 5取消预约
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
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
}