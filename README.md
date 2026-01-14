# QR Code Generator

A Spring Boot application for generating QR codes. This RESTful service allows you to generate QR codes from text or URLs through simple API endpoints using ZXing library.

## Features

- Generate QR codes from text or URLs
- Simple REST API endpoint
- Returns QR code as PNG image
- Built with Spring Boot and ZXing library

## Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher

## API Endpoints

### Generate QR Code

**Endpoint:** `GET /qr/generate`

**Query Parameters:**
- `text` (required): The text or URL to encode in the QR code

**Response:**
- Content-Type: `image/png`
- Success (200): Returns the QR code image in PNG format

**Example Request:**
```
GET http://localhost:8080/qr/generate?text=Hello%20World
```

**cURL Example:**
```bash
curl -X GET "http://localhost:8080/qr/generate?text=Hello%20World" --output qrcode.png
```

## Running the Application

1. Build the application:
   ```bash
   mvn clean install
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`

## Project Structure

```
src/
├── main/
│   ├── java/com/QRCodeGenerator/QRCodeGenerator/
│   │   ├── controller/     # REST controllers
│   │   ├── service/        # Business logic
│   │   └── QrCodeGeneratorApplication.java  # Main application class
│   └── resources/
│       └── application.properties  # Application configuration
└── test/                       # Test files
```

## Dependencies

- Spring Boot Starter Web
- ZXing Core (for QR code generation)
- ZXing Java SE Extensions

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [ZXing](https://github.com/zxing/zxing) - Barcode image processing library
- [Maven](https://maven.apache.org/) - Dependency Management

## Usage

1. Start the application (see "Running the Application" section)
2. Use any HTTP client to call the `/qr/generate` endpoint with the text you want to encode
3. The API will return a PNG image of the generated QR code

### Example Usage with cURL

```bash
# Generate QR code and save to file
curl -X GET "http://localhost:8080/qr/generate?text=Hello%20World" --output qrcode.png

# Or open directly in browser:
# http://localhost:8080/qr/generate?text=Hello%20World
```

### Example Usage with JavaScript/Fetch

```javascript
// In a web application
async function generateQR(text) {
    const response = await fetch(`http://localhost:8080/qr/generate?text=${encodeURIComponent(text)}`);
    const blob = await response.blob();
    const imageUrl = URL.createObjectURL(blob);
    
    // Display the QR code
    const img = document.createElement('img');
    img.src = imageUrl;
    document.body.appendChild(img);
}

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Development Setup

1. Clone the repository
2. Import as Maven project in your favorite IDE
3. Run `mvn clean install` to install dependencies
4. Run the `QrCodeGeneratorApplication` class to start the application

### Testing

Run the test suite with:
```bash
mvn test
```

## Acknowledgments

- [ZXing](https://github.com/zxing/zxing) - Barcode image processing library
