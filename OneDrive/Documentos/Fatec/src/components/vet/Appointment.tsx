import React, { useState, useEffect } from 'react';
import { motion } from 'motion/react';
import { ArrowLeft, Save, CheckCircle, AlertCircle, Dog, User, FileText, Stethoscope, TestTube, ClipboardList } from 'lucide-react';
import { Button } from '../ui/button';
import { Card } from '../ui/card';
import { Input } from '../ui/input';
import { Label } from '../ui/label';
import { Textarea } from '../ui/textarea';
import { Collapsible, CollapsibleContent, CollapsibleTrigger } from '../ui/collapsible';
import { toast } from 'sonner@2.0.3';

interface AppointmentProps {
  appointment: any;
  onBack: () => void;
}

export default function Appointment({ appointment, onBack }: AppointmentProps) {
  const [formData, setFormData] = useState({
    weight: '',
    temperature: '',
    symptoms: '',
    examResults: '',
    diagnosis: '',
    treatment: '',
  });
  const [openSections, setOpenSections] = useState<Record<string, boolean>>({
    animal: true,
    symptoms: true,
    exams: false,
    diagnosis: false,
  });

  // Auto-save every 5 seconds
  useEffect(() => {
    const interval = setInterval(() => {
      if (Object.values(formData).some(v => v !== '')) {
        toast.success('Rascunho salvo automaticamente', { duration: 1500 });
      }
    }, 5000);

    return () => clearInterval(interval);
  }, [formData]);

  const handleSave = () => {
    toast.success('✅ Atendimento salvo com sucesso');
  };

  const handleComplete = () => {
    if (!formData.diagnosis || !formData.treatment) {
      toast.error('⚠ Campos obrigatórios ausentes (Diagnóstico e Tratamento)');
      return;
    }
    toast.success('✅ Consulta encerrada com sucesso');
    setTimeout(onBack, 1500);
  };

  const toggleSection = (section: string) => {
    setOpenSections({ ...openSections, [section]: !openSections[section] });
  };

  if (!appointment) {
    return (
      <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
        <p className="text-gray-500">Nenhuma consulta selecionada</p>
      </div>
    );
  }

  return (
    <div className="max-w-5xl mx-auto px-4 sm:px-6 lg:px-8 py-8 pb-24">
      <motion.div
        initial={{ opacity: 0, y: 20 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.5 }}
      >
        <Button
          variant="ghost"
          onClick={onBack}
          className="mb-6"
        >
          <ArrowLeft size={18} strokeWidth={1.5} className="mr-2" />
          Voltar
        </Button>

        <div className="flex items-center justify-between mb-8">
          <div>
            <h1 className="text-3xl text-[#14213D] mb-1">Ficha Médica</h1>
            <p className="text-gray-600">Consulta às {appointment.time}</p>
          </div>
          <div className="flex gap-3">
            <Button
              onClick={handleSave}
              variant="outline"
              className="border-[#FCA311] text-[#FCA311] hover:bg-[#FCA311] hover:text-white"
            >
              <Save size={18} strokeWidth={1.5} className="mr-2" />
              Salvar e Continuar
            </Button>
            <Button
              onClick={handleComplete}
              className="bg-green-600 hover:bg-green-700 text-white"
            >
              <CheckCircle size={18} strokeWidth={1.5} className="mr-2" />
              Encerrar Consulta
            </Button>
          </div>
        </div>

        <div className="space-y-4">
          {/* Animal Data Section */}
          <Collapsible open={openSections.animal} onOpenChange={() => toggleSection('animal')}>
            <Card>
              <CollapsibleTrigger className="w-full p-6 flex items-center justify-between hover:bg-gray-50 transition-colors">
                <div className="flex items-center gap-3">
                  <div className="w-10 h-10 rounded-lg bg-blue-100 flex items-center justify-center">
                    <Dog size={20} strokeWidth={1.5} className="text-blue-600" />
                  </div>
                  <h3 className="text-[#14213D]">Dados do Animal</h3>
                </div>
                <motion.div
                  animate={{ rotate: openSections.animal ? 180 : 0 }}
                  transition={{ duration: 0.3 }}
                >
                  ▼
                </motion.div>
              </CollapsibleTrigger>
              <CollapsibleContent>
                <div className="px-6 pb-6 space-y-4">
                  <div className="grid grid-cols-2 gap-4 p-4 bg-gray-50 rounded-lg">
                    <div>
                      <p className="text-sm text-gray-600">Nome</p>
                      <p className="text-[#14213D]">{appointment.animal}</p>
                    </div>
                    <div>
                      <p className="text-sm text-gray-600">Espécie</p>
                      <p className="text-[#14213D]">{appointment.species}</p>
                    </div>
                    <div>
                      <p className="text-sm text-gray-600">Proprietário</p>
                      <p className="text-[#14213D]">{appointment.owner}</p>
                    </div>
                    <div>
                      <p className="text-sm text-gray-600">Motivo</p>
                      <p className="text-[#14213D]">{appointment.reason}</p>
                    </div>
                  </div>
                  <div className="grid grid-cols-2 gap-4">
                    <div>
                      <Label htmlFor="weight">Peso (kg)</Label>
                      <Input
                        id="weight"
                        type="number"
                        step="0.1"
                        value={formData.weight}
                        onChange={(e) => setFormData({ ...formData, weight: e.target.value })}
                        placeholder="Ex: 15.5"
                      />
                    </div>
                    <div>
                      <Label htmlFor="temperature">Temperatura (°C)</Label>
                      <Input
                        id="temperature"
                        type="number"
                        step="0.1"
                        value={formData.temperature}
                        onChange={(e) => setFormData({ ...formData, temperature: e.target.value })}
                        placeholder="Ex: 38.5"
                      />
                    </div>
                  </div>
                </div>
              </CollapsibleContent>
            </Card>
          </Collapsible>

          {/* Symptoms Section */}
          <Collapsible open={openSections.symptoms} onOpenChange={() => toggleSection('symptoms')}>
            <Card>
              <CollapsibleTrigger className="w-full p-6 flex items-center justify-between hover:bg-gray-50 transition-colors">
                <div className="flex items-center gap-3">
                  <div className="w-10 h-10 rounded-lg bg-green-100 flex items-center justify-center">
                    <FileText size={20} strokeWidth={1.5} className="text-green-600" />
                  </div>
                  <h3 className="text-[#14213D]">Sintomas</h3>
                </div>
                <motion.div
                  animate={{ rotate: openSections.symptoms ? 180 : 0 }}
                  transition={{ duration: 0.3 }}
                >
                  ▼
                </motion.div>
              </CollapsibleTrigger>
              <CollapsibleContent>
                <div className="px-6 pb-6">
                  <Label htmlFor="symptoms">Descrição dos sintomas</Label>
                  <Textarea
                    id="symptoms"
                    value={formData.symptoms}
                    onChange={(e) => setFormData({ ...formData, symptoms: e.target.value })}
                    placeholder="Descreva os sintomas apresentados pelo animal..."
                    rows={5}
                    className="mt-2"
                  />
                </div>
              </CollapsibleContent>
            </Card>
          </Collapsible>

          {/* Exams Section */}
          <Collapsible open={openSections.exams} onOpenChange={() => toggleSection('exams')}>
            <Card>
              <CollapsibleTrigger className="w-full p-6 flex items-center justify-between hover:bg-gray-50 transition-colors">
                <div className="flex items-center gap-3">
                  <div className="w-10 h-10 rounded-lg bg-purple-100 flex items-center justify-center">
                    <TestTube size={20} strokeWidth={1.5} className="text-purple-600" />
                  </div>
                  <h3 className="text-[#14213D]">Exames e Resultados</h3>
                </div>
                <motion.div
                  animate={{ rotate: openSections.exams ? 180 : 0 }}
                  transition={{ duration: 0.3 }}
                >
                  ▼
                </motion.div>
              </CollapsibleTrigger>
              <CollapsibleContent>
                <div className="px-6 pb-6">
                  <Label htmlFor="examResults">Resultados dos exames</Label>
                  <Textarea
                    id="examResults"
                    value={formData.examResults}
                    onChange={(e) => setFormData({ ...formData, examResults: e.target.value })}
                    placeholder="Registre os resultados dos exames realizados..."
                    rows={5}
                    className="mt-2"
                  />
                </div>
              </CollapsibleContent>
            </Card>
          </Collapsible>

          {/* Diagnosis Section */}
          <Collapsible open={openSections.diagnosis} onOpenChange={() => toggleSection('diagnosis')}>
            <Card>
              <CollapsibleTrigger className="w-full p-6 flex items-center justify-between hover:bg-gray-50 transition-colors">
                <div className="flex items-center gap-3">
                  <div className="w-10 h-10 rounded-lg bg-orange-100 flex items-center justify-center">
                    <ClipboardList size={20} strokeWidth={1.5} className="text-[#FCA311]" />
                  </div>
                  <h3 className="text-[#14213D]">Diagnóstico Final</h3>
                </div>
                <motion.div
                  animate={{ rotate: openSections.diagnosis ? 180 : 0 }}
                  transition={{ duration: 0.3 }}
                >
                  ▼
                </motion.div>
              </CollapsibleTrigger>
              <CollapsibleContent>
                <div className="px-6 pb-6 space-y-4">
                  <div>
                    <Label htmlFor="diagnosis">Diagnóstico *</Label>
                    <Textarea
                      id="diagnosis"
                      value={formData.diagnosis}
                      onChange={(e) => setFormData({ ...formData, diagnosis: e.target.value })}
                      placeholder="Diagnóstico do veterinário..."
                      rows={4}
                      className="mt-2"
                    />
                  </div>
                  <div>
                    <Label htmlFor="treatment">Tratamento *</Label>
                    <Textarea
                      id="treatment"
                      value={formData.treatment}
                      onChange={(e) => setFormData({ ...formData, treatment: e.target.value })}
                      placeholder="Prescrição e recomendações de tratamento..."
                      rows={4}
                      className="mt-2"
                    />
                  </div>
                </div>
              </CollapsibleContent>
            </Card>
          </Collapsible>
        </div>
      </motion.div>
    </div>
  );
}
