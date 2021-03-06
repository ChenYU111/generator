package com.internation.info.model;

import java.io.Serializable;
import java.util.Date;

public class QuestionRevert implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questionrevert.id
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questionrevert.revertMessage
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    private String revertMessage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questionrevert.createTime
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questionrevert.uId
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    private Integer uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questionrevert.questionId
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    private Integer questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questionrevert.questionFloor
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    private Integer questionFloor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column questionrevert.revertFloor
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    private Integer revertFloor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questionrevert.id
     *
     * @return the value of questionrevert.id
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questionrevert.id
     *
     * @param id the value for questionrevert.id
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questionrevert.revertMessage
     *
     * @return the value of questionrevert.revertMessage
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public String getRevertMessage() {
        return revertMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questionrevert.revertMessage
     *
     * @param revertMessage the value for questionrevert.revertMessage
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void setRevertMessage(String revertMessage) {
        this.revertMessage = revertMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questionrevert.createTime
     *
     * @return the value of questionrevert.createTime
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questionrevert.createTime
     *
     * @param createTime the value for questionrevert.createTime
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questionrevert.uId
     *
     * @return the value of questionrevert.uId
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questionrevert.uId
     *
     * @param uId the value for questionrevert.uId
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questionrevert.questionId
     *
     * @return the value of questionrevert.questionId
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questionrevert.questionId
     *
     * @param questionId the value for questionrevert.questionId
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questionrevert.questionFloor
     *
     * @return the value of questionrevert.questionFloor
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public Integer getQuestionFloor() {
        return questionFloor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questionrevert.questionFloor
     *
     * @param questionFloor the value for questionrevert.questionFloor
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void setQuestionFloor(Integer questionFloor) {
        this.questionFloor = questionFloor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column questionrevert.revertFloor
     *
     * @return the value of questionrevert.revertFloor
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public Integer getRevertFloor() {
        return revertFloor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column questionrevert.revertFloor
     *
     * @param revertFloor the value for questionrevert.revertFloor
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void setRevertFloor(Integer revertFloor) {
        this.revertFloor = revertFloor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", revertMessage=").append(revertMessage);
        sb.append(", createTime=").append(createTime);
        sb.append(", uId=").append(uId);
        sb.append(", questionId=").append(questionId);
        sb.append(", questionFloor=").append(questionFloor);
        sb.append(", revertFloor=").append(revertFloor);
        sb.append("]");
        return sb.toString();
    }
}