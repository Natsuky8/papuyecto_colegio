package spring.PapuyectoColegio.entity;


import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Builder
@Table(schema = "public",name = "schools")
public class SchoolsEntity {
 @Id
 @Column (name = "schools_id")
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "schools_schools_id_seq")
 @SequenceGenerator(name = "schools_schools_id_seq",sequenceName = "schools_schools_id_seq",allocationSize = 1,schema = "public")
    private Integer schoolId;
 @Column(name = "name" )
 private String name;
    @Column(name="address" )
    private String address;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "created_at")
    @CreationTimestamp
    private Timestamp created_at;
    @Column(name = "update_at")
    @UpdateTimestamp
    private Timestamp update_at;




}
