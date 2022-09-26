package com.swapnil;

import java.time.LocalDate;
import java.util.Objects;

public class Member {
		
	private int memberId;
	private String memberName;
	private int memberNo;
	private LocalDate date;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(memberId, memberNo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return  memberId == other.memberId
				&& memberNo == other.memberNo;
	}


	public Member() {
		super();
	}


	public Member(int memberId, String memberName, int memberNo, LocalDate date) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberNo = memberNo;
		this.date = date;
	}


	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public int getMemberNo() {
		return memberNo;
	}


	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberNo=" + memberNo + ", date="
				+ date + "]";
	}
	
	
	
}
