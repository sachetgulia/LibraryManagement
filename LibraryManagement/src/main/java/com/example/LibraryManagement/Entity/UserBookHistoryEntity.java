package com.example.LibraryManagement.Entity;

    import javax.persistence.*;

    @Entity
    @Table(name = "userBookHisory")
    public class UserBookHistoryEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        private int uid;
        private int bid;
        private String startDate;
        private String endDate;

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public int getBid() {
            return bid;
        }

        public void setBid(int bid) {
            this.bid = bid;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public UserBookHistoryEntity(int uid, int bid, String startDate) {
            this.uid = uid;
            this.bid = bid;
            this.startDate = startDate;
        }

        public UserBookHistoryEntity(int uid, int bid, String startDate, String endDate) {
            this.uid = uid;
            this.bid = bid;
            this.startDate = startDate;

            this.endDate = endDate;
        }
    }

