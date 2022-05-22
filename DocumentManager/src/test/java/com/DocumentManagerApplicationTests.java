package com;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class DocumentManagerApplicationTests {

	@Autowired
	private DocumentRepo docRepo;

	@Autowired
	private TestEntityManager entityManger;

	@Test
	@Rollback(false)
	void testInsertDocument() throws IOException {

		File file = new File("H:\\QD\\mysql.txt");

		Document document = new Document();

		document.setName(file.getName());

		byte[] bytes = Files.readAllBytes(file.toPath());
		document.setContent(bytes);
		long fileSize = bytes.length;
		document.setSize(fileSize);
		document.setUploadTime(null);

		Document savDoc = docRepo.save(document);

		Document existDoc = entityManger.find(Document.class, savDoc.getId());

		assertThat(existDoc.getSize()).isEqualTo(fileSize);

	}

}
