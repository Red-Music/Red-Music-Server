package org.example.music.user.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_admin_music")
@Entity
public class AdminMusic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(30)", nullable = false)
    private String singer;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String musicFile;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String musicImage;

    public AdminMusic(String singer, String musicFile, String musicImage) {
        this.singer = singer;
        this.musicFile = musicFile;
        this.musicImage = musicImage;
    }
}
