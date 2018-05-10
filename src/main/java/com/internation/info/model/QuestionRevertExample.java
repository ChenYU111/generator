package com.internation.info.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionRevertExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public QuestionRevertExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRevertMessageIsNull() {
            addCriterion("revertMessage is null");
            return (Criteria) this;
        }

        public Criteria andRevertMessageIsNotNull() {
            addCriterion("revertMessage is not null");
            return (Criteria) this;
        }

        public Criteria andRevertMessageEqualTo(String value) {
            addCriterion("revertMessage =", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageNotEqualTo(String value) {
            addCriterion("revertMessage <>", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageGreaterThan(String value) {
            addCriterion("revertMessage >", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageGreaterThanOrEqualTo(String value) {
            addCriterion("revertMessage >=", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageLessThan(String value) {
            addCriterion("revertMessage <", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageLessThanOrEqualTo(String value) {
            addCriterion("revertMessage <=", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageLike(String value) {
            addCriterion("revertMessage like", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageNotLike(String value) {
            addCriterion("revertMessage not like", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageIn(List<String> values) {
            addCriterion("revertMessage in", values, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageNotIn(List<String> values) {
            addCriterion("revertMessage not in", values, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageBetween(String value1, String value2) {
            addCriterion("revertMessage between", value1, value2, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageNotBetween(String value1, String value2) {
            addCriterion("revertMessage not between", value1, value2, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("uId is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("uId is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("uId =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("uId <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("uId >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uId >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("uId <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("uId <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("uId in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("uId not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("uId between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uId not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("questionId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("questionId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("questionId =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("questionId <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("questionId >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionId >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("questionId <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("questionId <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("questionId in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("questionId not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("questionId between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("questionId not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorIsNull() {
            addCriterion("questionFloor is null");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorIsNotNull() {
            addCriterion("questionFloor is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorEqualTo(Integer value) {
            addCriterion("questionFloor =", value, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorNotEqualTo(Integer value) {
            addCriterion("questionFloor <>", value, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorGreaterThan(Integer value) {
            addCriterion("questionFloor >", value, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionFloor >=", value, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorLessThan(Integer value) {
            addCriterion("questionFloor <", value, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorLessThanOrEqualTo(Integer value) {
            addCriterion("questionFloor <=", value, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorIn(List<Integer> values) {
            addCriterion("questionFloor in", values, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorNotIn(List<Integer> values) {
            addCriterion("questionFloor not in", values, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorBetween(Integer value1, Integer value2) {
            addCriterion("questionFloor between", value1, value2, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andQuestionFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("questionFloor not between", value1, value2, "questionFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorIsNull() {
            addCriterion("revertFloor is null");
            return (Criteria) this;
        }

        public Criteria andRevertFloorIsNotNull() {
            addCriterion("revertFloor is not null");
            return (Criteria) this;
        }

        public Criteria andRevertFloorEqualTo(Integer value) {
            addCriterion("revertFloor =", value, "revertFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorNotEqualTo(Integer value) {
            addCriterion("revertFloor <>", value, "revertFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorGreaterThan(Integer value) {
            addCriterion("revertFloor >", value, "revertFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("revertFloor >=", value, "revertFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorLessThan(Integer value) {
            addCriterion("revertFloor <", value, "revertFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorLessThanOrEqualTo(Integer value) {
            addCriterion("revertFloor <=", value, "revertFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorIn(List<Integer> values) {
            addCriterion("revertFloor in", values, "revertFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorNotIn(List<Integer> values) {
            addCriterion("revertFloor not in", values, "revertFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorBetween(Integer value1, Integer value2) {
            addCriterion("revertFloor between", value1, value2, "revertFloor");
            return (Criteria) this;
        }

        public Criteria andRevertFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("revertFloor not between", value1, value2, "revertFloor");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table questionrevert
     *
     * @mbggenerated do_not_delete_during_merge Sun May 06 14:56:00 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table questionrevert
     *
     * @mbggenerated Sun May 06 14:56:00 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}