package vtech.invoices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vtech.invoices.models.Invoice;
import vtech.invoices.services.InvoiceServicesImplementation;

	@RestController
	public class InvoiceController {
		
		@Autowired
		private InvoiceServicesImplementation invoiceService;
		
		@GetMapping("/all")
		public List<Invoice> getAll()
		{
			
			return invoiceService.getAllInvoice();
			
		}
		
		@GetMapping("/find/{Id}")
		public ResponseEntity<Invoice> getById(@PathVariable Long Id) {
			Invoice invoice = invoiceService.getById(Id);
			if (invoice == null)
					{
						return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);				
					}
			return ResponseEntity.ok(invoice);
	 	}
		
		@PostMapping("/add")
		public ResponseEntity<Invoice> create(@RequestBody Invoice invoice){
			Invoice inv = invoiceService.create(invoice);
			return new ResponseEntity("Created",HttpStatus.CREATED);
		}
		
		@PutMapping("/update/{Id}")
		public ResponseEntity<String> Update(@PathVariable Long Id, @RequestBody Invoice inv){
			
			Invoice invoice = invoiceService.update(Id, inv);
			return ResponseEntity.ok("Updated");
		}
		
		@DeleteMapping("/delete/{Id}")
		public ResponseEntity<Invoice> delete(@PathVariable Long Id){
			invoiceService.delete(Id);
			return new ResponseEntity("Invoice not found",HttpStatus.NOT_FOUND);
		}
		@GetMapping("/invoice/{name}")
		public List<Invoice> getAllInvByName(@PathVariable String name){
			return invoiceService.getAllInvbyname(name);
		}
		
	}