package com;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AppController {

	@Autowired
	private DocumentRepo docRepo;
	
	@RequestMapping("")
	public String viewHomePage()
	{
		
		return "home";
	}
	@PostMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile multipartFile,
			RedirectAttributes ra) throws IOException {
		
		String fileName=StringUtils.cleanPath(multipartFile.getOriginalFilename());
		
		Document document = new Document();
		
		document.setName(fileName);
		document.setContent(multipartFile.getBytes());
		document.setSize(multipartFile.getSize());
		document.setUploadTime(null);
		
		System.out.println(document);
		
		docRepo.save(document);
		
		ra.addFlashAttribute("message"," The file has been uploaded successfully.");
		
		return "home";
	}
}
