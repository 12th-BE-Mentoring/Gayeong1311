package org.example.backendmentoring;

import jakarta.persistence.*;

@Entity
public class Student {

    public Student() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@Id는 기본키라고 가리키는 역할,@GeneratedValue객체가 늘어날때마다 수가 증가하게하는 역할
    private Long id; //기본키

    @Column(name = "number")
    //java와 데이터베이스에서의 이름이 다르게 하기 위함
    //즉, 위의 목적이 아니면 @Column을 사용하지 않아도 된다.
    private int studentNumber;
    private int phoneNumber;
    private String name;
    private int studentPoint;

    public void minusStudentPoint(int studentPoint){
        this.studentPoint -= studentPoint;
    }

    public void plusStudentPoint(int studentPoint){
        this.studentPoint += studentPoint;
    }
}