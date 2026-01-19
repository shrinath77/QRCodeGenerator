package com.QRCodeGenerator.QRCodeGenerator.controller;
import com.QRCodeGenerator.QRCodeGenerator.service.QrCodeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/qr")
public class QrCodeController {

    private static final Logger log = LoggerFactory.getLogger(QrCodeController.class);

    private final QrCodeService qrCodeService;

    public QrCodeController(QrCodeSegit rvice qrCodeService) {

        this.qrCodeService = qrCodeService;
    }

    @GetMapping(value = "/generate", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> generateQr(@RequestParam String text) throws Exception {

        log.info("Genrating QR For "+text);
        byte[] qrImage = qrCodeService.generateQrCode(text);
        return ResponseEntity.ok(qrImage);
    }

    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> test() {

        log.warn("Test Api called");

        return ResponseEntity.ok(Map.of("status", "ok"));
    }

}