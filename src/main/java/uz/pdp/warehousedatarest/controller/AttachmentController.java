package uz.pdp.warehousedatarest.controller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.warehousedatarest.entity.Attachment;
import uz.pdp.warehousedatarest.payload.Result;
import uz.pdp.warehousedatarest.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/upload")
    public Result uploadPhoto(MultipartHttpServletRequest request) {
        Result result = attachmentService.uploadFile(request);
        return result;
    }

    @GetMapping
    public List<Attachment> getAttachmentList() {
        List<Attachment> attachmentList = attachmentService.getAttachmentListService();
        return attachmentList;
    }

    @GetMapping("/{id}")
    public Attachment getAttachmentById(@PathVariable Integer id) {
        Attachment attachmentById = attachmentService.getAttachmentByIdService(id);
        return attachmentById;
    }

    @SneakyThrows
    @GetMapping("/download/{id}")
    public void getAttachmentDownload(@PathVariable Integer id, HttpServletResponse response) {
        attachmentService.getFileToDownload(id, response);
    }

    @DeleteMapping("/{id}")
    public Result deleteAttachmentById(@PathVariable Integer id) {
        Result result = attachmentService.deleteAttachmentService(id);
        return result;
    }
}
