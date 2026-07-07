package org.example.backendmentoring;

import jakarta.persistence.*;

@Entity
public class Student {

    public Student() {

        //자바 코드, 패러다임 불일치sql과 자바는 다름어노테이션?
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@Id는 기본키라고 가리키는 역할,@GeneratedValue객체가 늘어날때마다 수가 증가하게하는 역할
    private Long id; //기본키

    @Column(name = "number")
    //java와 데이터베이스에서의 이름이 다르게 하기 위함
    //즉, 위의 목적이 아니면 @Column을 사용하지 않아도 된다.
    //@Table이라는 어노테이션으로도 지정할 수 있다. 이 경우에는 Table의 이름을 지정하는 것
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