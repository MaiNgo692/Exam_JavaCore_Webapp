package com.ra.web.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "student", schema = "exam_javacore_webapp", catalog = "")
public class StudentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idStudent", nullable = false)
    private Integer idStudent;
    @Basic
    @Column(name = "address", nullable = true, length = 255)
    private String address;
    @Basic
    @Column(name = "birthday", nullable = true)
    private Date birthday;
    @Basic
    @Column(name = "image_url", nullable = true, length = 255)
    private String imageUrl;
    @Basic
    @Column(name = "phone_number", nullable = true, length = 15)
    private String phoneNumber;
    @Basic
    @Column(name = "sex", nullable = true)
    private Boolean sex;
    @Basic
    @Column(name = "student_name", nullable = true, length = 100)
    private String studentName;

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(idStudent, that.idStudent) && Objects.equals(address, that.address) && Objects.equals(birthday, that.birthday) && Objects.equals(imageUrl, that.imageUrl) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(sex, that.sex) && Objects.equals(studentName, that.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent, address, birthday, imageUrl, phoneNumber, sex, studentName);
    }
}
