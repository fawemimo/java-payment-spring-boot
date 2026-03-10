package com.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name="name")
    private String name;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(name="state")
    private String state;

    @Column(nullable = false, name = "password")
    private String password;

//    One to many relationship
    @Builder.Default
    @OneToMany(mappedBy = "user")
    private List<Address> addresses = new ArrayList<>();

//    Many To Many Relationship
    @ManyToMany
    @JoinTable(
            name = "user_tags",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="tag_id")
    )
    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

//    One To One Relationship
    @OneToOne(mappedBy = "user")
    private Profile profile;

//    Many To Many to products
    @ManyToMany
    @JoinTable(
            name="wishlist",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="product_id")
    )
    private Set<Product> wishlist = new HashSet<>();


    public void addAddress(Address address){
        addresses.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address){
        addresses.remove(address);
        address.setUser(null);
    }

    public void addTag(String tagName){
        var tag = new Tag(tagName);
        tags.add(tag);
        tag.getUsers().add(this);
    }

    public void removeTag(String tagName){
        tags.remove(new Tag(tagName));
    }
}
