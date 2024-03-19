package org.example.music.user.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, columnDefinition = "VARCHAR(20)", nullable = false)
    private String userId;

    @Column(columnDefinition = "CHAR(255)", nullable = false)
    private String password;

    @Builder
    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public void changeUserId(String userId) {
        this.userId = userId;
    }
}
