package org.example;

public interface CustomerDAO {

  Customer getById(long id);

  void update(Customer customer);
}
