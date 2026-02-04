package br.com.umacamp.api.member;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "umademp_camp_2025")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {

    @Id
    private Long id;

    @Column(name = "dt_response")
    private LocalDateTime dtResponse;

    private String email;

    @Column(nullable = false, length = 200)
    private String name;

    private LocalDate birthday;

    private Integer age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "water_baptism")
    private String waterBaptism;

    @Column(name = "holy_spirit_baptism")
    private String holySpiritBaptism;

    @Column(length = 300)
    private String talent;

    @Column(name = "tshirt_model")
    private String tshirtModel;

    @Column(name = "women_tshirt_size")
    private String womenTshirtSize;

    @Column(name = "men_tshirt_size")
    private String menTshirtSize;

    @Column(nullable = false)
    private String sector;

    @Column(name = "cong_atibaia")
    private String congAtibaia;
    @Column(name = "cong_sede")
    private String congSede;
    @Column(name = "cong_rioacima")
    private String congRioacima;
    @Column(name = "cong_terrapreta")
    private String congTerrapreta;

    private String congregation;

    @Column(name = "education_level")
    private String educationLevel;
    @Column(name = "technical_course")
    private String technicalCourse;
    @Column(name = "higher_education")
    private String higherEducation;

    @Column(name = "working_now")
    private String workingNow;
    private String profession;
    @Column(name = "job_opportunity")
    private String jobOpportunity;

    @Column(columnDefinition = "TEXT", name = "hear_you")
    private String hearYou;
}