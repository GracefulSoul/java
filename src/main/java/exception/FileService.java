package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	public List<String> usingTryCatch() {
		List<String> rows = new ArrayList<>();
		// You must declare the InputStreamReader, BufferedReader class outside the try~catch syntax so it can be used and closed.
		InputStreamReader inputStreamReader = new InputStreamReader(FileService.class.getClassLoader().getResourceAsStream("music.txt"));
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(inputStreamReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				rows.add(line);
			}
			return rows;
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // Must close the InputStreamReader, BufferedReader class.
			try {
				inputStreamReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public List<String> usingTryWithResources() {
		List<String> rows = new ArrayList<>();
		try (InputStreamReader inputStreamReader = new InputStreamReader(FileService.class.getClassLoader().getResourceAsStream("music.txt"));
			 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				rows.add(line);
			}
			return rows;
		} catch (IOException e) {
			e.printStackTrace();
		} // Even if you don't use the Finally keyword, the BufferedReader closes automatically.
		return null;
	}

	public List<String> usingThrows() throws IOException { // Pass the IOException to the caller.
		List<String> rows = new ArrayList<>();
		try (InputStreamReader inputStreamReader = new InputStreamReader(FileService.class.getClassLoader().getResourceAsStream("music.txt"));
			 BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				rows.add(line);
			}
			return rows;
		}
	}

	public List<String> usingThrow() { // Pass the IOException to the caller.
		List<String> rows = new ArrayList<>();
		try (InputStreamReader inputStreamReader = new InputStreamReader(FileService.class.getClassLoader().getResourceAsStream("music.txt"));
			 BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				rows.add(line);
			}
			return rows;
		} catch (IOException e) {
			throw new FileException("An error occurred while loading the file.", e);
		}
	}

}
