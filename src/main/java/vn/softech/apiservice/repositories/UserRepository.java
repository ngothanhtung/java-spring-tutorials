package vn.softech.apiservice.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.softech.apiservice.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
