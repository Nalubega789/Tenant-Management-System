# Tenant Management System
An Android app for landlords to record tenants, see total rent, and call tenants.

## Download
Latest APK: see **Releases** on the right of this page.

## Features
- Register and log in
- Dashboard with number of tenants and total rent
- Add tenants and view all tenants (saved with Room)
- Call a tenant, options menu and navigation drawer

## Architecture
ui/ Activities, Fragments and TenantViewModel (UI layer)
data/ Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)
Screens → TenantViewModel (LiveData) → TenantRepository → Room

## Team
| Stage | Member                           | Admission No.       | Pull request                                                                    |
|---|----------------------------------|---------------------|---------------------------------------------------------------------------------|
| 1 Lead | [Hindu Nalubega]                 | [170448]            | [https://github.com/Nalubega789/Tenant-Management-System/commits/master/a876d99648130974ec4b42b5ddae470cf27750b2] |
| 2 ViewModel | [Denzel Male Robert]             | [169074]            | [https://github.com/Nalubega789/Tenant-Management-System/commits/master/0ce1f625542d77be20fb7ea13f2ea7bdba6cc731] |
| 3 Room | [Raphael Mbuva]                  | [192045]            | [https://github.com/Nalubega789/Tenant-Management-System/commits/master/99f1c9868d8536391ac9fcaf8d41fe206248698e] |
| 4 Screens | [Alvin Boro and Ivanna Githinji] | [190399 and 190804] | [https://github.com/Nalubega789/Tenant-Management-System/commits/master/15f9503cfcac43e18f2beca481e93f3d66f3e703]                                                                              |
| 5 Data integration | [Bakhita Muturi]                 | [192282]            | [https://github.com/Nalubega789/Tenant-Management-System/commits/master/6a5e97c89511a9955ff9df7f1f74cb460e7bd9d0]                                                                              |
| 6 Release | [Terryane Sigei]                 | [190379]            | []                                                                              |