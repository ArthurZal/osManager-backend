package service;

import model.ServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ServiceOrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceOrderService {

    @Autowired
    private ServiceOrderRepository serviceOrderRepository;

    public List<ServiceOrder> getAllServiceOrders(){
        return serviceOrderRepository.findAll();
    }

    public Optional<ServiceOrder> getServiceOrderById(Long id) {
        return serviceOrderRepository.findById(id);
    }

    public ServiceOrder saveServiceOrder(ServiceOrder serviceOrder) {
        return  serviceOrderRepository.save(serviceOrder);
    }

    public void deleteServiceOrder(Long id) {
        serviceOrderRepository.deleteById(id);
    }
}
