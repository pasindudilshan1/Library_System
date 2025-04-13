package com.example.library_system.Models;

public class IssueRecord {

    private String Issue_Id;
    private String book_Id;
    private String Member_Id;
    private String Issue_Date;
    private String Return_Date;
    private String Status;

    public IssueRecord(String issue_Id,String book_Id, String member_Id,String issue_Date,String return_Date,String status) {
        this.Issue_Id=issue_Id;
        this.book_Id=book_Id;
        this.Member_Id=member_Id;
        this.Issue_Date=issue_Date;
        this.Return_Date=return_Date;
        this.Status=status;

    }

    public String getReturn_Date() {
        return Return_Date;
    }

    public void setReturn_Date(String return_Date) {
        Return_Date = return_Date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getIssue_Date() {
        return Issue_Date;
    }

    public void setIssue_Date(String issue_Date) {
        Issue_Date = issue_Date;
    }

    public String getMember_Id() {
        return Member_Id;
    }

    public void setMember_Id(String member_Id) {
        Member_Id = member_Id;
    }

    public String getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(String book_Id) {
        this.book_Id = book_Id;
    }

    public String getIssue_Id() {
        return Issue_Id;
    }

    public void setIssue_Id(String issue_Id) {
        Issue_Id = issue_Id;
    }
}
