package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Order;

@RepositoryRestResource(path = "order")
public interface OrderRepository extends JpaRepository<Order, Integer> {

//    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
//    @Override
//    <S extends Order> S save(S s);
//
//    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN')")
//    @Override
//    void deleteById(Integer integer);
}
