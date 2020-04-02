/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.service;

import java.util.List;
import myapp.model.Follower;

/**
 *
 * @author michele
 */
public interface FollowerService {
    Follower findById(int id);
    void saveFollower(Follower follower);
    void updateFollower(Follower follower);
    void deleteFollower(int id);
    List<Follower> findAllFollowers();
}
