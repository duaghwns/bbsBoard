package com.duaghwns.bbsBoard.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @RequiredArgsConstructor
@SequenceGenerator(name = "USER_SEQ_GENERATOR",
                    sequenceName = "user_seq",
                    initialValue = 1, allocationSize = 1)
public class User {

    @Id
    @Column(name = "bbs_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ_GENERATOR")
    private int seq;
    @Column(name = "ID", length = 15, nullable = false)
    private String id;
    @Column(name = "PW", length = 20, nullable = false)
    private String pw;
    @Column(name = "NM", length = 15, nullable = false)
    private String nm;
    @Column(name = "NICK",length = 10)
    private String nick;
    @Column(name = "BIRTH", nullable = false)
    private Date birth;
    @Column(name = "HP", nullable = false, length = 10)
    private String hp;


    @Builder
    public User(String id, String nm, String pw, String nick, Date birth, String hp) {
        this.id = id;
        this.nm = nm;
        this.pw = pw;
        this.nick = nick;
        this.birth = birth;
        this.hp = hp;
    }
}
