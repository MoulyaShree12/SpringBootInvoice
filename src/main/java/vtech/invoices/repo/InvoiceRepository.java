package vtech.invoices.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import vtech.invoices.models.Invoice;


public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

	@Query("Select i from Invoice i where i.invName=:name")
	public  List<Invoice> getAllInvoiceByName(String name);
}
