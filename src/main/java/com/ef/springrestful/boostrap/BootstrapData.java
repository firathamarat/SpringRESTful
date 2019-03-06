package com.ef.springrestful.boostrap;

import com.ef.springrestful.domain.Customer;
import com.ef.springrestful.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner { // Alt + Enter: Implement Method

    private final CustomerRepository customerRepository; // Add CustomerRepository, Add Constructor parameter

    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer c1 = new Customer();
        c1.setName("Leanne Graham");
        c1.setUsername("Bret");
        c1.setEmail("Sincere@april.biz");
        c1.setAddress("Kulas Light suite Apt. 556");
        c1.setPhone("1-770-736-8031");
        c1.setCompany("Romaguera Crona");
        customerRepository.save(c1);

        //-

        Customer c2 = new Customer();
        c2.setName("Ervin Howell");
        c2.setUsername("Antonette");
        c2.setEmail("Shanna@melissa.tv");
        c2.setAddress("Victor Plains suite Suite 879");
        c2.setPhone("010-692-6593");
        c2.setCompany("Deckow Crist");
        customerRepository.save(c2);

        //-

        Customer c3 = new Customer();
        c3.setName("Clementine Bauch");
        c3.setUsername("Samantha");
        c3.setEmail("Nathan@yesenia.net");
        c3.setAddress("Douglas Extension suite Suite 847");
        c3.setPhone("1-463-123-4447");
        c3.setCompany("Romaguera Jacobson");
        customerRepository.save(c3);

        //-

        Customer c4 = new Customer();
        c4.setName("Patricia Lebsack");
        c4.setUsername("Karianne");
        c4.setEmail("Julianne.OConner@kory.org");
        c4.setAddress("street Hoeger Mall suite Apt. 692");
        c4.setPhone("493-170-9623");
        c4.setCompany("Robel-Corkery");
        customerRepository.save(c4);

        //-

        Customer c5 = new Customer();
        c5.setName("Chelsey Dietrich");
        c5.setUsername("Kamren");
        c5.setEmail("Lucio_Hettinger@annie.ca");
        c5.setAddress("Skiles Walks suite Suite 351");
        c5.setPhone("254-954-1289");
        c5.setCompany("Keebler LLC");
        customerRepository.save(c5);

    }

}
