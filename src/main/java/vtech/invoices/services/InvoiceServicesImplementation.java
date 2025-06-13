package vtech.invoices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vtech.invoices.models.Invoice;
import vtech.invoices.repo.InvoiceRepository;

@Service
public class InvoiceServicesImplementation implements InvoiceServices{
	
	@Autowired
	private InvoiceRepository invoiceRepo;

	@Override
	public List<Invoice> getAllInvoice() {
		
		return invoiceRepo.findAll();
	}

	@Override
	public Invoice getById(Long id) {
		
		return invoiceRepo.findById(id)
				.orElse(null);
	}

	@Override
	public Invoice create(Invoice invoice) {
		
		return invoiceRepo.save(invoice);
	}

	@Override
	public Invoice update(Long id, Invoice invoice) {
		Invoice existinginvoice = getById(id);
		existinginvoice.setInvName(invoice.getInvName());
		existinginvoice.setInvAmount(invoice.getInvAmount());
		existinginvoice.setInvFinalAmount(invoice.getInvFinalAmount());
		existinginvoice.setInvContact(invoice.getInvContact());
		existinginvoice.setInvRecivedDate(invoice.getInvRecivedDate());
		existinginvoice.setInvVendor(invoice.getInvVendor());
		invoiceRepo.save(existinginvoice);
				return existinginvoice;
	}

	@Override
	public void delete(Long id) {
		invoiceRepo.deleteById(id);
	
	}
	public List<Invoice> getAllInvbyname(String name) {
		return invoiceRepo.getAllInvoiceByName(name);
	}

	
}
