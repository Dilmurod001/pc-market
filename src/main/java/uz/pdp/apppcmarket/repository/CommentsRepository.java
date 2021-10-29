package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Comments;

@RepositoryRestResource(path = "comments")
public interface CommentsRepository extends JpaRepository<Comments, Integer> {

//    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR')")
//    @Override
//    <S extends Comments> S save(S s);
//
//    @PreAuthorize(value = "hasRole('SUPER_ADMIN')")
//    @Override
//    void deleteById(Integer integer);
}
