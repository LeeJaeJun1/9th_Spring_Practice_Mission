package com.example.umc9th.domain.member.entity;

import com.example.umc9th.domain.member.enums.Address;
import com.example.umc9th.domain.member.enums.Gender;
import com.example.umc9th.domain.member.enums.SocialType;
import com.example.umc9th.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Table(name = "member")
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 3, nullable = false)
    private String name;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Gender gender = Gender.NONE;

    @Column(name = "birth", nullable = false)
    private LocalDate birth;

    @Column(name = "address", nullable = false)
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Address address = Address.NONE;

    @Column(name = "detail_address", length = 500, nullable = false)
    private String detailAddress;

    @Column(name = "social_uid", length = 500, nullable = false)
    private String socialUid;

    @Column(name = "social_type", length = 500, nullable = false)
    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    @Column(name = "point", nullable = false)
    private int point;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "phone_number", length = 100, nullable = true)
    private String phoneNumber;

    @Column(name = "delted_at", nullable = true)
    private LocalDateTime deletedAt;
}
