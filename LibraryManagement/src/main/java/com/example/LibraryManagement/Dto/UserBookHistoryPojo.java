package com.example.LibraryManagement.Dto;

public class UserBookHistoryPojo {
    int userId;
    int bookId;
    String startdate;
    String enddate;

    public UserBookHistoryPojo(int userId, int bookId, String startdate, String enddate) {
        this.userId = userId;
        this.bookId = bookId;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public UserBookHistoryPojo(int userId, int bookId, String startdate) {
        this.userId = userId;
        this.bookId = bookId;
        this.startdate = startdate;
    }

    public int getUserId() {
        return userId;


    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
}
