package com.xingwei.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andStunoIsNull() {
            addCriterion("stuno is null");
            return (Criteria) this;
        }

        public Criteria andStunoIsNotNull() {
            addCriterion("stuno is not null");
            return (Criteria) this;
        }

        public Criteria andStunoEqualTo(Integer value) {
            addCriterion("stuno =", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotEqualTo(Integer value) {
            addCriterion("stuno <>", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoGreaterThan(Integer value) {
            addCriterion("stuno >", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuno >=", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLessThan(Integer value) {
            addCriterion("stuno <", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLessThanOrEqualTo(Integer value) {
            addCriterion("stuno <=", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoIn(List<Integer> values) {
            addCriterion("stuno in", values, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotIn(List<Integer> values) {
            addCriterion("stuno not in", values, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoBetween(Integer value1, Integer value2) {
            addCriterion("stuno between", value1, value2, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotBetween(Integer value1, Integer value2) {
            addCriterion("stuno not between", value1, value2, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStuageIsNull() {
            addCriterion("stuage is null");
            return (Criteria) this;
        }

        public Criteria andStuageIsNotNull() {
            addCriterion("stuage is not null");
            return (Criteria) this;
        }

        public Criteria andStuageEqualTo(Long value) {
            addCriterion("stuage =", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotEqualTo(Long value) {
            addCriterion("stuage <>", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageGreaterThan(Long value) {
            addCriterion("stuage >", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageGreaterThanOrEqualTo(Long value) {
            addCriterion("stuage >=", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageLessThan(Long value) {
            addCriterion("stuage <", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageLessThanOrEqualTo(Long value) {
            addCriterion("stuage <=", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageIn(List<Long> values) {
            addCriterion("stuage in", values, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotIn(List<Long> values) {
            addCriterion("stuage not in", values, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageBetween(Long value1, Long value2) {
            addCriterion("stuage between", value1, value2, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotBetween(Long value1, Long value2) {
            addCriterion("stuage not between", value1, value2, "stuage");
            return (Criteria) this;
        }

        public Criteria andGranameIsNull() {
            addCriterion("graname is null");
            return (Criteria) this;
        }

        public Criteria andGranameIsNotNull() {
            addCriterion("graname is not null");
            return (Criteria) this;
        }

        public Criteria andGranameEqualTo(String value) {
            addCriterion("graname =", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameNotEqualTo(String value) {
            addCriterion("graname <>", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameGreaterThan(String value) {
            addCriterion("graname >", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameGreaterThanOrEqualTo(String value) {
            addCriterion("graname >=", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameLessThan(String value) {
            addCriterion("graname <", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameLessThanOrEqualTo(String value) {
            addCriterion("graname <=", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameLike(String value) {
            addCriterion("graname like", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameNotLike(String value) {
            addCriterion("graname not like", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameIn(List<String> values) {
            addCriterion("graname in", values, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameNotIn(List<String> values) {
            addCriterion("graname not in", values, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameBetween(String value1, String value2) {
            addCriterion("graname between", value1, value2, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameNotBetween(String value1, String value2) {
            addCriterion("graname not between", value1, value2, "graname");
            return (Criteria) this;
        }

        public Criteria andStusexIsNull() {
            addCriterion("stusex is null");
            return (Criteria) this;
        }

        public Criteria andStusexIsNotNull() {
            addCriterion("stusex is not null");
            return (Criteria) this;
        }

        public Criteria andStusexEqualTo(Integer value) {
            addCriterion("stusex =", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotEqualTo(Integer value) {
            addCriterion("stusex <>", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThan(Integer value) {
            addCriterion("stusex >", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThanOrEqualTo(Integer value) {
            addCriterion("stusex >=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThan(Integer value) {
            addCriterion("stusex <", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThanOrEqualTo(Integer value) {
            addCriterion("stusex <=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexIn(List<Integer> values) {
            addCriterion("stusex in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotIn(List<Integer> values) {
            addCriterion("stusex not in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexBetween(Integer value1, Integer value2) {
            addCriterion("stusex between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotBetween(Integer value1, Integer value2) {
            addCriterion("stusex not between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andSchooladdressIsNull() {
            addCriterion("schooladdress is null");
            return (Criteria) this;
        }

        public Criteria andSchooladdressIsNotNull() {
            addCriterion("schooladdress is not null");
            return (Criteria) this;
        }

        public Criteria andSchooladdressEqualTo(String value) {
            addCriterion("schooladdress =", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressNotEqualTo(String value) {
            addCriterion("schooladdress <>", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressGreaterThan(String value) {
            addCriterion("schooladdress >", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressGreaterThanOrEqualTo(String value) {
            addCriterion("schooladdress >=", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressLessThan(String value) {
            addCriterion("schooladdress <", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressLessThanOrEqualTo(String value) {
            addCriterion("schooladdress <=", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressLike(String value) {
            addCriterion("schooladdress like", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressNotLike(String value) {
            addCriterion("schooladdress not like", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressIn(List<String> values) {
            addCriterion("schooladdress in", values, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressNotIn(List<String> values) {
            addCriterion("schooladdress not in", values, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressBetween(String value1, String value2) {
            addCriterion("schooladdress between", value1, value2, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressNotBetween(String value1, String value2) {
            addCriterion("schooladdress not between", value1, value2, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("homeaddress is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("homeaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("homeaddress =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("homeaddress <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("homeaddress >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("homeaddress >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("homeaddress <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("homeaddress <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("homeaddress like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("homeaddress not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("homeaddress in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("homeaddress not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("homeaddress between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("homeaddress not between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andCardidIsNull() {
            addCriterion("cardid is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("cardid is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(Integer value) {
            addCriterion("cardid =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(Integer value) {
            addCriterion("cardid <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(Integer value) {
            addCriterion("cardid >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cardid >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(Integer value) {
            addCriterion("cardid <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(Integer value) {
            addCriterion("cardid <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<Integer> values) {
            addCriterion("cardid in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<Integer> values) {
            addCriterion("cardid not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(Integer value1, Integer value2) {
            addCriterion("cardid between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(Integer value1, Integer value2) {
            addCriterion("cardid not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classid is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classid is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classid =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classid <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classid >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classid >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classid <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classid <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classid in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classid not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classid between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classid not between", value1, value2, "classid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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