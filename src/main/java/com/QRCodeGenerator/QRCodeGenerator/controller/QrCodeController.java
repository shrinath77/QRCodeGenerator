package com.QRCodeGenerator.QRCodeGenerator.controller;

import com.QRCodeGenerator.QRCodeGenerator.service.QrCodeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qr")
public class QrCodeController {

    private final QrCodeService qrCodeService;

    public QrCodeController(QrCodeService qrCodeService) {

        this.qrCodeService = qrCodeService;
    }

    @GetMapping(value = "/generate", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> generateQr(@RequestParam String text) throws Exception {

        byte[] qrImage = qrCodeService.generateQrCode(text);
        return ResponseEntity.ok(qrImage);
    }

}