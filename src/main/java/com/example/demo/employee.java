package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;



@Entity


@AllArgsConstructor
@NoArgsConstructor
public class employee {
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empFonNumber=" + empFonNumber + ", empEmailId="
				+ empEmailId + ", empAddress=" + empAddress + ", empPosition=" + empPosition + ", empSalary="
				+ empSalary + ", joiningdate=" + joiningdate + ", supervisorName=" + supervisorName + ", department="
				+ department + "]";
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpFonNumber() {
		return empFonNumber;
	}
	public void setEmpFonNumber(String empFonNumber) {
		this.empFonNumber = empFonNumber;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Id
	private long empId;
	private String empName;
	private String empFonNumber;
	private String empEmailId;
	private String empAddress;
	private String empPosition;
	private String empSalary;
	private String joiningdate;
	private String supervisorName;
	private String department;
	
	

}
