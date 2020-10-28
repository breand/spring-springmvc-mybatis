  @Test
     public void testService(){
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         AccountService accountService = (AccountService) applicationContext.getBean("accountService");
         accountService.findAll();
     }

