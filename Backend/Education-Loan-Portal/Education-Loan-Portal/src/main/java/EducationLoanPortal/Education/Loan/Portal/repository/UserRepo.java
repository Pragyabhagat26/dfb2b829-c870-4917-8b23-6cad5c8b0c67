package EducationLoanPortal.Education.Loan.Portal.repository;

import EducationLoanPortal.Education.Loan.Portal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);
}