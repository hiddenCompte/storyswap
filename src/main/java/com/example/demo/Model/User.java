package com.example.demo.Model;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity 
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ; 
    @Column(nullable = false , length = 50 )
    private String username  ;
    @Column(nullable = false , length = 50 )
    private String email  ;
    @Column(nullable = false , length = 50 )
    private String password_hash  ;
    @Column(nullable = true , length = 50 )
    private String avatar_url  ;
    @Column(nullable = false , length = 300 )
    private String bio  ;
    @CreationTimestamp
    @Column(updatable = false) 
    private LocalDateTime created_at  ;
    @Column(nullable = false )
    private boolean is_premium  ;

      public User (){}
      public User(String username , String email , String password_hash , String avatar_url , String bio  ){
        this.username = username ; 
        this.email = email ; 
        this.password_hash   = password_hash ; 
        this.avatar_url = avatar_url ; 
        this.bio = bio ; 
      }
      public int getId() {
          return id;
      }
      public void setId(int id) {
          this.id = id;
      }
      public String getUsername() {
          return username;
      }
      public void setUsername(String username) {
          this.username = username;
      }
      public String getEmail() {
          return email;
      }
      public void setEmail(String email) {
          this.email = email;
      }
      public String getPassword_hash() {
          return password_hash;
      }
      public void setPassword_hash(String password_hash) {
          this.password_hash = password_hash;
      }
      public String getAvatar_url() {
          return avatar_url;
      }
      public void setAvatar_url(String avatar_url) {
          this.avatar_url = avatar_url;
      }
      public String getBio() {
          return bio;
      }
      public void setBio(String bio) {
          this.bio = bio;
      }
      public LocalDateTime getCreated_at() {
          return created_at;
      }
      public void setCreated_at(LocalDateTime created_at) {
          this.created_at = created_at;
      }
      public boolean isIs_premium() {
          return is_premium;
      }
      public void setIs_premium(boolean is_premium) {
          this.is_premium = is_premium;
      }

}
