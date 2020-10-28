  package com.ssm.service.impl;
  import com.ssm.dao.AccountDao;
  import com.ssm.pojo.Account;
  import com.ssm.service.AccountService;
  import org.springframework.stereotype.Service; 
 import java.util.List;
  
 /**
  * 业务层的实现类
  */
 @Service("accountService")
 public class AccountServiceImpl implements AccountService {
     private AccountDao account;
 
     public List<Account> findAll() {
         System.out.println("业务层：查询所有用户");
         return null;
     }
 
     public Account findById(Integer id) {
         return null;
     }
 
     public void saveAccount(Account account) {
         
     }
 
     public void deleteAccount(Integer id) {
 
     }
 
     public void updateAccount(Account account) {
 
     }
 }

