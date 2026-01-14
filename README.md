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


## Acknowledgments

- [ZXing](https://github.com/zxing/zxing) - Barcode image processing library
