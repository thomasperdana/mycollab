CREATE TABLE `m_prj_invoice` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `createdTime` datetime NOT NULL,
  `lastUpdatedTime` datetime NOT NULL,
  `createdUser` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `assignUser` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `amount` double NOT NULL,
  `currentId` int(11) DEFAULT NULL,
  `clientId` int(10) unsigned DEFAULT NULL,
  `contactUserFullName` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sAccountId` int(11) NOT NULL,
  `status` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `note` varchar(400) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `description` text COLLATE utf8mb4_unicode_ci,
  `type` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `noId` varchar(400) COLLATE utf8mb4_unicode_ci NOT NULL,
  `projectId` int(10) unsigned NOT NULL,
  `issueDate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_m_prj_invoice_1_idx` (`currentId`),
  KEY `FK_m_prj_invoice_2_idx` (`clientId`),
  KEY `FK_m_prj_invoice_3_idx` (`sAccountId`),
  KEY `FK_m_prj_invoice_4_idx` (`projectId`),
  CONSTRAINT `FK_m_prj_invoice_1` FOREIGN KEY (`currentId`) REFERENCES `s_currency` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `FK_m_prj_invoice_2` FOREIGN KEY (`clientId`) REFERENCES `m_crm_account` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_m_prj_invoice_3` FOREIGN KEY (`sAccountId`) REFERENCES `s_account` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_m_prj_invoice_4` FOREIGN KEY (`projectId`) REFERENCES `m_prj_project` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;