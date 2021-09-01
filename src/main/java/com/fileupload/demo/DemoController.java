package com.fileupload.demo;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class DemoController {
	
	@GetMapping("")
	public String main() {
		return "main";
	}
	@PostMapping("upload")
	public String upload(@RequestParam("upload_thumbnail") MultipartFile file) {
		String path;
		path = "d:/upload";
		File Folder = new File(path);
		String name = file.getName() +"."+ FilenameUtils.getExtension(file.getOriginalFilename());
		File saveFile = new File(path, name);
		try {
			if (!Folder.exists()) Folder.mkdir(); // 폴더가 없는경우 폴더 생성
			file.transferTo(saveFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "main";

	}

}
