package vtech.invoices.services;

import java.util.List;

import vtech.invoices.models.Invoice;

public interface InvoiceServices {

	List<Invoice> getAllInvoice();
	Invoice getById(Long id);
	Invoice create(Invoice invoice);
	Invoice update(Long id,Invoice invoice);
     void delete(Long id);
    List<Invoice> getAllInvbyname(String name);
}
//Abstract methods